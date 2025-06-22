package com.factories;

import com.documents.Document;
import com.documents.PdfDocument;

public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
