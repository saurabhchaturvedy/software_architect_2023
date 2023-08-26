package DesignPatternAug2023.Behavioral.Strategy;

public class DesignExecutor {


    public static void main(String[] args) {

        DocumentCreationStrategyHandler documentCreationStrategyHandler = new DocumentCreationStrategyHandler();
        documentCreationStrategyHandler.handleStrategy("PPT");

        documentCreationStrategyHandler.handleStrategy("DOC");

        documentCreationStrategyHandler.handleStrategy("EXCEL");
    }
}
