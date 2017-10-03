package documentsummerizationusingstackdecodermethod.model;

import documentsummerizationusingstackdecodermethod.processor.SentenceProcessor;

public class Summary extends Document
{
    boolean isHuman;//Meaningful

    public Summary(String filename, long documentId, boolean isHuman)
    {
        super(SentenceProcessor.getSentences(filename), filename, documentId);
        this.isHuman = isHuman;
    }

    public Summary()
    {	
        //empty Constructor
    }

    public boolean isHuman()
    {
        return isHuman;
    }
}
