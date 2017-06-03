package app.models.implementation.Requirements;

import app.models.implementation.ObservableEntryHolder;
import app.models.interfaces.Requirements.I_CommentEntry;
import app.models.interfaces.Requirements.I_Comments;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Erstellt von Julius am 23/04/2017.
 */
class Comments extends ObservableEntryHolder<I_CommentEntry> implements I_Comments {
    @Override
    public I_CommentEntry createEntry() {
        return new CommentEntry();
    }

    @Override
    public void exportAsXML(XMLStreamWriter xmlWriter) throws XMLStreamException {
        
    }

    @Override
    public void importFromXML(XMLStreamReader xmlReader) throws XMLStreamException {

    }
}
