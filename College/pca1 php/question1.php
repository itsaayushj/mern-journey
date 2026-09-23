<?php
// php -S localhost:8000

$math = 85; 
$english = 78; 
$computer = 92;
$science = 71;
$php = 95;

$total = $math + $english + $computer + $science + $php;

$percentage = $total / 500 * 100;
echo "Math : $math <br>"; 
echo "English : $english <br> "; 
echo "Computer : $computer <br>"; 
echo "php : $php <br>"; 
echo "Total : $total <br>";  
echo "Percentage : $percentage <br>";
if ($percentage >= 90) {
    echo "Grade : A+";
} elseif ($percentage >= 80) {
    echo "Grade : A";
} elseif ($percentage >= 70) {
    echo "Grade : B";
} elseif ($percentage >= 60) {
    echo "Grade : C";
} else {
    echo "Grade : Fail";
}

