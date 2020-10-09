package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
@SpringBootApplication
public class ImdbScraperApplication {

	public static void main(String[] args) throws Exception {
		/*  how to scrape the top 250 movies from IMDB using Java and Jsoup.
		 * 	display header , title and rating 
		 * 	
		 * */
		SpringApplication.run(ImdbScraperApplication.class, args);
		final Document document = Jsoup.connect("http://www.imdb.com/chart/top").get();
		final Elements header = document.select("h1.header");
		final String hea = header.text();
		System.err.println(hea);
        for (Element row : document.select("table.chart.full-width tr")) {

            final String title = row.select(".titleColumn a").text();
            final String rating = row.select(".imdbRating").text();
            
            System.out.println(title + " -> Rating: " + rating);
        }
	}

}
