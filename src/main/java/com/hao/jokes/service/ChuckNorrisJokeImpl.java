package com.hao.jokes.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeImpl implements JokeService {
    private static final ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

    public ChuckNorrisJokeImpl() {

    }

    @Override
    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
