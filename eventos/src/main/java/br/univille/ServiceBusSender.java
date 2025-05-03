package br.univille;

import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusSenderClient;
import com.azure.messaging.servicebus.ServiceBusMessage;
import com.azure.messaging.servicebus.administration.ServiceBusAdministrationClient;
import com.azure.messaging.servicebus.administration.ServiceBusAdministrationClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ServiceBusSender {

    private static final String TOPIC_NAME = "topic-das1";
    private static final String NAMESPACE_FQDN = "sb-das12025-test-brazilsouth.servicebus.windows.net";

    public static void main(String[] args) throws IOException {
        // Credenciais para autenticação no Azure.
        DefaultAzureCredential credential = new DefaultAzureCredentialBuilder().build();

        // Cria um cliente para enviar mensagens para o tópico.
        ServiceBusSenderClient senderClient = new ServiceBusClientBuilder()
                .credential(NAMESPACE_FQDN, credential)
                .sender()
                .topicName(TOPIC_NAME)
                .buildClient();

        // Cria o cliente de administração para criar o tópico (se necessário)
        ServiceBusAdministrationClient adminClient = new ServiceBusAdministrationClientBuilder()
                .credential(NAMESPACE_FQDN, credential)
                .buildClient();

        // Cria o tópico. Se já existir, não faz nada.
        try {
            adminClient.createTopic(TOPIC_NAME);
            System.out.println("Tópico '" + TOPIC_NAME + "' criado (ou já existia).");
        } catch (Exception e) {
            System.out.println("Erro ao criar tópico (pode já existir): " .concat(e.getMessage()));
        }


        // Prepara para ler a entrada.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Digite as mensagens para enviar para o tópico (ou 'sair' para encerrar):");
        String message;

        // Loop principal para ler mensagens do usuário e enviar para o Service Bus.
        while (true) {
            message = reader.readLine();
            if (message == null || message.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando...");
                break;
            }

            // Cria uma mensagem do Service Bus
            ServiceBusMessage busMessage = new ServiceBusMessage(message);

            // Envia a mensagem para o tópico
            senderClient.sendMessage(busMessage);
            System.out.println("Mensagem enviada para '" + TOPIC_NAME + "': " + message);
        }

        // Fecha o cliente sender
        senderClient.close();
        // adminClient.close();  // Remova esta linha
        System.out.println("Conexão com Service Bus encerrada.");
    }
}