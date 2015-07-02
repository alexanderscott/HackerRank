-- https://www.hackerrank.com/challenges/african-cities

SELECT c2.Name
FROM City c2
LEFT JOIN Country c1 ON c2.CountryCode = c1.Code
WHERE c1.Continent = 'Africa';
