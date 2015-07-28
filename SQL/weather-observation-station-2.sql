-- https://www.hackerrank.com/challenges/weather-observation-station-2

SELECT CONCAT(CAST(CONVERT(DECIMAL(10,2) ,SUM(LAT_N)) AS nvarchar), " ", CAST(CONVERT(DECIMAL(10,2), SUM(LONG_W)) AS nvarchar)) AS summed FROM STATION;
