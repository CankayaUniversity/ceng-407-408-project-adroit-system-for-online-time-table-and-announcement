﻿<%@ Page Language="C#" AutoEventWireup="true" CodeFile="AdminHomepage.aspx.cs" Inherits="AdminHomepage" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Admin Homepage</title>
    <link rel="shortcut icon" href="images/icons/favicon_adminn.ico">
    	<link rel="stylesheet" type="text/css" href="css/util.css">
	    <link rel="stylesheet" type="text/css" href="css/main.css">
        <link rel="stylesheet" type="text/css" href="css/3dbutton.css">
 
<style>

.button {
  padding: 15px 25px;
  font-size: 24px;
  text-align: center;
  cursor: pointer;
  outline: none;
  color: #fff;
  background-color: #818181;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;
  height:50px;
    width:300px;
}

.button:hover {background-color: #ffbe0a}

.button:active {
  background-color: #ffbe0a;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}


</style>
  
</head>
<body style= "background: linear-gradient(to bottom right, #818181, #000000)">
    <div class="limiter">
		<div class="container-login100" >
			<div class="wrap-login100 p-t-30 p-b-50">
				<span class="login100-form-title p-b-41">
                    <center><asp:Image ID="Image1" runat="server" ImageUrl="images/logo.png" Height="100px" Width="100px"/></center>
                    <asp:Label ID="lblMessage" runat="server" Text="Welcome"></asp:Label>
                   <br /> <asp:Label ID="lblWelcome" runat="server" Text="Label"></asp:Label>
                </span>
                <form class="login100-form validate-form p-b-33 p-t-5"  runat="server">
                    
                   <br />
                    <center><asp:Button ID="btnVerify" class="button" runat="server" Text="Verify the Device" OnClick="btnVerify_Click"  /></center>
                     <br />
                     <br />
                    <center><asp:Button ID="btnAddTeacher" class="button" runat="server" Text="Add a Teacher" OnClick="btnAddTeacher_Click"  /></center>
                <br />
                     <br />
                    <center><asp:Button ID="btnLogout" class="button" runat="server" Text="Logout" OnClick="btnLogout_Click"  /></center>
                      
                 
                </form>
                </div>
		</div>
	</div>
</body>
</html>
