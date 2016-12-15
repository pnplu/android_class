<?php
$host = "localhost";
$username = "zp9439_ochar";
$password = "Ochar1121";
$db_name = "zp9439_ochar";

$connect = mysqli_connect($host, $username, $password, $db_name) or die("Error Connection!");
mysqli_set_charset($connect, "utf8");
 ?>
