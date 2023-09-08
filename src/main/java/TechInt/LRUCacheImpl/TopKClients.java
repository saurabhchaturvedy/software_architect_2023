package TechInt.LRUCacheImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopKClients {
    public static List<Client> findTopKClients(List<Client> clients, int k) {
        // Aggregate sales by client name
        Map<String, Double> totalSalesByClient = new HashMap<>();
        for (Client client : clients) {
            totalSalesByClient.put(client.getName(), totalSalesByClient.getOrDefault(client.getName(), 0.0) + client.getSales());
        }

        // Sort the clients based on total sales in descending order
        List<Client> sortedClients = totalSalesByClient.entrySet().stream()
                .map(entry -> new Client(entry.getKey(), entry.getValue()))
                .sorted((c1, c2) -> Double.compare(c2.getSales(), c1.getSales()))
                .collect(Collectors.toList());

        // Get the top k clients
        List<Client> topKClients = sortedClients.subList(0, Math.min(k, sortedClients.size()));

        return topKClients;
    }

    public static void main(String[] args) {
        // Example data (client names and sales amounts)
        // Replace this with your actual data
        List<Client> salesData = new ArrayList<>();
        salesData.add(new Client("Client A", 1000));
        salesData.add(new Client("Client B", 1500));
        salesData.add(new Client("Client C", 800));
        salesData.add(new Client("Client A", 3000));
        salesData.add(new Client("Client B", 1200));
        salesData.add(new Client("Client D", 2000));

        // Number of top clients to find
        int k = 2;

        // Find the top k clients with maximum total sales
        List<Client> topKClients = findTopKClients(salesData, k);

        // Display the result
        System.out.println("Top " + k + " clients with maximum total sales:");
        for (Client client : topKClients) {
            System.out.println(client.getName() + ": $" + client.getSales());
        }
    }
}