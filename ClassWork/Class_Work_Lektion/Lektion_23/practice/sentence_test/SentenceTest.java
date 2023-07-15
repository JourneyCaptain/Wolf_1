package Lektion_23.practice.sentence_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class SentenceTest {
    //поле класса
    Sentence sentence;// opredeleaem pole s tipom testiruemogo  klassa Sentence i sozdaiom obiekt sentence takogo tipa

   @BeforeEach
    void setUp() {
       sentence = new Sentence("Это мое предложение"); // sozdali obitkt sentence klassa Sentence 
    }

   @Test
    void wordsInSentence() {
       String st = "Привет и пока";
      int n = sentence.wordsInSentence(st);
      assertEquals(3,n);
    }

    @Test
    void lettersInSentence() {
       String st = " Я к вам пишу, чего же боле ...";
       assertEquals(19,sentence.lettersInSentence(st));
    }
}