package DesignPatternAug2023.Behavioral.Strategy;

import java.util.HashMap;
import java.util.Map;

public class DocumentCreationStrategyHandler {


    ExcelDocCreationStrategy excelDocCreationStrategy = new ExcelDocCreationStrategy();
    PPTDocCreationStrategy pptDocCreationStrategy = new PPTDocCreationStrategy();
    WordDocCreationStrategy wordDocCreationStrategy = new WordDocCreationStrategy();

    Map<String, DocumentCreationStrategy> strategyMap = new HashMap<>();


    public void handleStrategy(String docType) {
        strategyMap.put("PPT", pptDocCreationStrategy);
        strategyMap.put("EXCEL", excelDocCreationStrategy);
        strategyMap.put("DOC", wordDocCreationStrategy);

        strategyMap.get(docType).createDocument();
    }
}
