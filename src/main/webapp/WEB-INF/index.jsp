<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en" data-bs-theme="dark">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="/css/bootstrap.min.css"/>
        <title>Your Project</title>
    </head>
    <body>
        <nav class="navbar bg-body-tertiary">
            <div class="container">
                <a class="navbar-brand" href="/">Achoo!</a>
            </div>
        </nav>
        <main class="container py-3">
            <div class="row">
                <div class="col-12 col-lg-6">
                    <div class="card shadow mb-3">
                        <h2 class="card-header mb-0">Location</h2>
                        <div class="card-body">
                            <p class="lead">Latitude: ${response.lat}</p>
                            <p class="lead">Longitude: ${response.lng}</p>
                            <p class="card-text" id="error"></p>
                            <button type="button" class="btn btn-primary w-100" onclick="setLocation()">Use Current Location</button>
                        </div>
                    </div>
                </div>
                <div class="col-12 col-lg-6">
                    <div class="card shadow mb-3">
                        <c:forEach var="item" items="${response.data}">
                            <h3 class="card-header mb-0">${item.timezone}</h3>
                            <div class="card-body">
                                <h4 class="card-title mb-3">Pollen Counts</h4>
                                <p class="card-text">
                                    <strong>Grass Pollen: </strong>${item.count.grassPollen}
                                </p>
                                <p class="card-text">
                                    <strong>Tree Pollen: </strong>${item.count.treePollen}
                                </p>
                                <p class="card-text">
                                    <strong>Weed Pollen: </strong>${item.count.weedPollen}
                                </p>

                                <h4 class="card-title mb-3">Risk Assessments:</h4>
                                <p class="card-text">
                                    <strong>Grass Pollen: </strong>${item.risk.grassPollen}
                                </p>
                                <p class="card-text">
                                    <strong>Tree Pollen: </strong>${item.risk.treePollen}
                                </p>
                                <p class="card-text">
                                    <strong>Weed Pollen: </strong>${item.risk.weedPollen}
                                </p>
                            </div>
                        </c:forEach>
                    </div>
                </div>
            </div>
        </main>
        <script src="/js/script.js"></script>
        <script src="/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
