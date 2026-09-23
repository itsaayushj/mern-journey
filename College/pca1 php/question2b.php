<?php
$a = 0;
$b = 1;
$count = 2 ;
echo "$a $b";
do {
    $c = $a + $b;
    $a = $b;
    $b = $c;
    echo " $c";
    $count += 1 ;

}while ($count < 10);
