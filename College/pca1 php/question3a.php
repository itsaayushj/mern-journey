<?php
$students = array(
    "A" => 85 , 
    "B" => 75 , 
    "C" => 100 , 
    "D" => 45 , 
    "E" => 11
);
echo "<table border= '1'>";
echo "<tr>";
echo "<th> Student Name </th>";
echo "<th> Percentage </th>";
echo "</tr>";
foreach ($students as $name => $percentage) {
    echo "<tr>";
    echo "<td> $name </td>";
    echo "<td> $percentage </td>";
    echo "</tr>";
}
echo "</table>";

$highest = 0 ;
$highestStudent = "";
foreach ($students as $name => $percentage) { 
    if ($highest < $percentage) {
        $highest = $percentage;
        $highestStudent = $name;
    }
}
echo "Highest Scorer : $highestStudent <br>";
echo "Highest Score : $highest <br>";
