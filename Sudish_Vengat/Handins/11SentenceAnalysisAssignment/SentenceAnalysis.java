public class SentenceAnalysis{

	String sentence = "I live in Foxboro";
	int number_of_words = 4;
	double average_word_size = 3.50;

	
	void number_of_words(String s){
	int start_word = 0;
	int finish_word = 1;
	int total_amount_of_words = 0;
	
	String current_word;
	
	
	current_word = sentence.substring(0, sentence.indexOf(' ')).trim();
	number_of_words++;
	
	total_amount_of_words = current_word.length();
	
	start_word = sentence.indexOf(' ', start_word + 1);
	finish_word = sentence.indexOf(' ', start_word + 1);
	
	while ((start_word < finish_word) && (start_word < sentence.length()-1)){
		current_word = sentence.substring(start_word, finish_word).trim();
		number_of_words++;
		total_amount_of_words += current_word.length();
		start_word = sentence.indexOf(' ', start_word + 1);
		finish_word = sentence.indexOf(' ', start_word + 1);
	}
	
	current_word = sentence.substring(start_word).trim();
	number_of_words++;
	total_amount_of_words += current_word.length();
	average_word_size = total_amount_of_words / number_of_words;
	}
	
}