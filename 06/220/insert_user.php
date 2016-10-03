<?php
require("db_connect.php");
$pass = true;

if(!empty($_POST["username"])) {
  $username = mysqli_escape_string($link, $_POST["username"]);
} else {
  $pass = false;
}
if(!empty($_POST["password"])) {
  $password = mysqli_escape_string($link, $_POST["password"]);
} else {
  $pass = false;
}
if(!empty($_POST["email"])) {
  $email = mysqli_escape_string($link, $_POST["email"]);
} else {
  $pass = false;
}
if(!empty($_POST["display_name"])) {
  $displayname = mysqli_escape_string($link, $_POST["display_name"]);
} else {
  $pass = false;
}

if(strlen($username) <= 0 ||
   strlen($password) <= 0 ||
   strlen($email) <= 0 ||
   strlen($displayname) <= 0) {
     $pass = false;
}
if($pass) {
  $sql = "INSERT INTO account (user_id, username, password, email, display_name)
          VALUES (0, '$username', '$password', '$email', '$displayname')";
  $query = mysqli_query($link, $sql) or die("Query Insert Error");

  include("search_userid.php");
}
 ?>
