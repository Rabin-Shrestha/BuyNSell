<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta http-equiv="Content-Type" content="text/html charset=UTF-8"/>
    <title>Add a Book</title>
</head>
<body>


<h1> My Profile </h1>
${user.userName}

<!--<form method="post" action="/updateProfile" th:action="@{/updateProfile}">-->
    <!--<div>-->
        <!--Email : <input type="text" placeholder="Email" name="email" th:value="${user.email}" th:readonly="true"/>-->
    <!--</div>-->

    <!--<div class="form-group">-->
        <!--Password : <input type="password" placeholder="Password" name="password" th:value="${user.password}"/>-->
    <!--</div>-->

    <!--<div class="form-group">-->
        <!--First Name : <input type="text" placeholder="First Name" name="firstName" th:value="${user.firstName}"/>-->
    <!--</div>-->
    <!--<div class="form-group">-->
        <!--Last Name : <input type="text" placeholder="Last Name" name="lastName" th:value="${user.lastName}"/>-->
    <!--</div>-->
    <!--<div class="form-group">-->
        <!--Phone : <input type="tel" placeholder="Phone" name="phone" th:value="${user.phone}"/>-->
    <!--</div>-->
    <!--<div class="form-group">-->
        <!--City : <input type="text" placeholder="City" name="address.city" th:value="${user.address.city}"/>-->
    <!--</div>-->
    <!--<div class="form-group">-->
        <!--State : <input type="text" placeholder="State" name="address.state" th:value="${user.address.state}"/>-->
    <!--</div>-->
    <!--<div class="form-group">-->
        <!--Country : <input type="text" placeholder="Country" name="address.country" th:value="${user.address.country}"/>-->
    <!--</div>-->
    <!--<div class="form-group">-->
        <!--ZipCode : <input type="text" placeholder="Zip Code" name="address.zipcode" th:value="${user.address.zipcode}"/>-->
    <!--</div>-->

    <!--<input type="hidden" name="id" th:value="${user.id}"/>-->
    <!--&lt;!&ndash;<input type="hidden" th:name="${_csrf.parameterName}" th:value="${_csrf.token}"/> &ndash;&gt;-->
    <!--<button type="submit">Update Profile</button>-->
<!--</form>-->

</body>
</html>