-- https://www.hackerrank.com/challenges/asian-population

SELECT  SUM(c2.Population) AS population
FROM    City c2
INNER JOIN Country c1 ON c2.CountryCode = c1.Code
WHERE c1.Continent = 'Asia'
GROUP BY c1.Continent;
