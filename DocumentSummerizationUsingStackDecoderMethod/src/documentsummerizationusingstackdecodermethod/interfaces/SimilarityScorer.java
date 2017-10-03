package documentsummerizationusingstackdecodermethod.interfaces;

import documentsummerizationusingstackdecodermethod.model.Sentence;

public interface SimilarityScorer
{
	public double similarity(Sentence a, Sentence b);
}
