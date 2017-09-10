var app = angular.module("AppModule", []);

app.controller("AppCtrl", function ($scope, $http) {

    $scope.db = [];

    $http.get('http://localhost:8080/api/users').success(function(data) {

        $scope.db = data;
    });
});