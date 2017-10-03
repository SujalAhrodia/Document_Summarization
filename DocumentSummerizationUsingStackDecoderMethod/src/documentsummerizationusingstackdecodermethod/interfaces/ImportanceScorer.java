package documentsummerizationusingstackdecodermethod.interfaces;

import java.util.List;

import documentsummerizationusingstackdecodermethod.model.Document;
import documentsummerizationusingstackdecodermethod.model.Sentence;

public interface ImportanceScorer
{
    public void initialize(List<Document> docs);
    public double getImportanceScore(Document doc, Sentence a);
    public void setWeightage(double weight);
    public double getWeightage();
    public String getName();
}
