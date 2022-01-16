# SynonymIT-backend
A repository for synonym collector

This spring boot app consists of Jsoup scraper that scrapes synonyms off google and gives the user results

To make use of this service -

Download STS and import this as a maven project and run the app
On postman send the following json aqttached in Body -
{
    "word":"petty"
}

You'll get Synonyms response in String with comma seperated values.

The response accuracy is 60-70% :), will improve on it one day. 
