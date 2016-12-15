<?php
require_once './config.php';

$sql = "SELECT * FROM user WHERE 1";

$test = mysqli_query($connect, $sql);

while ($rows = mysqli_fetch_assoc($test))
{
  $name = $rows['user_name'];
}
echo $name;
 ?>
