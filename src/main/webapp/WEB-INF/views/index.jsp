<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>

    <meta charset="UTF-8">
    <title>FLOWERSBY</title>

    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Lobster&display=swap" rel="stylesheet">

    <link rel="stylesheet" href="http://unpkg.com/@fortawesome/fontawesome-free/css/fontawesome.css" />
    <link rel="stylesheet" href="http://unpkg.com/@fortawesome/fontawesome-free/css/brands.css" />
    <link rel="stylesheet" href="http://unpkg.com/@fortawesome/fontawesome-free/css/regular.css" />
    <link rel="stylesheet" href="http://unpkg.com/@fortawesome/fontawesome-free/css/solid.css" />


    <style>
        .bottom-left {
            position: absolute;
            bottom: 20px;
            left: 20px;
        }

        .bottom-right {
            position: absolute;
            bottom: 20px;
            right: 20px;
        }

        .fa-instagram {
            color: #FF1493;
        }

        .fa-adjust {
            color: #444;
        }

        .dark-theme .fa-adjust {
            color: deeppink;
        }

        h2 {
            color: #d54d7b; font-family: «Great Vibes», cursive; font-size: 165px; line-height: 160px; font-weight: normal; margin-bottom: 0px; margin-top: 40px; text-align: center; text-shadow: 0 1px 1px #fff;
        }

        .dark-theme h2 {
            color: #eee;
            text-shadow: none;
        }

        button {
            padding: 8px 16px;
            background: orange;
            border: 0;
            border-radius: 5px;
            font-size: 18px;
            color: #333;
            margin: 6px;
            cursor: pointer;
            border: 2px solid transparent;
        }

        button:hover {
            border: 2px solid #333;
        }

        div {
            text-align: center;
        }

        .images {
            margin: 50px auto 0 auto;
        }

        .images img {
            width: 15%;
            margin: 5px;
        }
    </style>
</head>

<body>
<%@ include file = "./parts/header.jsp" %>

<h2>FLOWERSBY</h2>

<div>
    <a href="/products?category=RING"><button><fmt:message key="product.category.rings" /></button></a>
    <a href="/products?category=PENDANT"><button><fmt:message key="product.category.pendants" /></button></a>
    <a href="/products?category=OTHER"><button><fmt:message key="product.category.others" /></button></a>
    <a href="/products"><button><fmt:message key="product.category.all" /></button></a>
</div>

<div class="images">
    <img src="https://instrument33.ru/wp/wp-content/uploads/2021/10/rozy.jpg" />
    <img src="https://phonoteka.org/uploads/posts/2021-03/1616990510_30-p-khrizantemi-buket-fon-pozdravlenie-43.jpg" />
    <img src="https://mobimg.b-cdn.net/v3/fetch/96/96fe038c4e39d77b284b3390c20e5c6d.jpeg" />
</div>

<div class="bottom-left">
    <a href="https://www.instagram.com/1flowerby"><i class="fab fa-instagram fa-2x"></i></a>
</div>

<div class="bottom-right">
    <i class="fas fa-adjust fa-2x"></i>
</div>

<%@ include file = "./parts/footer.jsp" %>
</body>
</html>

