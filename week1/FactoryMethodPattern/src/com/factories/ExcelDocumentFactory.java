package com.factories;

import com.documents.Document;
import com.documents.ExcelDocument;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
