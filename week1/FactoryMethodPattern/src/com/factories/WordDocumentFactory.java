package com.factories;

import com.documents.Document;
import com.documents.WordDocument;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
