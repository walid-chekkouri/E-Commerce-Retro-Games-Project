<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<div class="container">

	

	<div class="row">

		<div class="col-md-offset-2 col-md-8">

			<div class="panel panel-primary">

				<div class="panel-heading">

					<h4>Product Management</h4>

				</div>
				
				<div class="panel-body">
				
			<!--  FORM ELRMRNTS -->	
			<form class="form-horizontal">
			
			<div class="form-group">
			<label class="control-label col-md-4" for="name"> Enter Products Name:</label>
			<div class="col-md-8">
			<input type="text" name="name" id="name" placeholder="Product Name" class="form-control"/>
			<em class="help-block">Please enter Product Name !</em>
			</div>
			
			</div>
			
			
			
			
	
			<div class="form-group">
			<label class="control-label col-md-4" for="brand"> Enter Brand Name:</label>
			<div class="col-md-8">
			<input type="text" name="brand" id="brand" placeholder="Brand Name" class="form-control"/>
			<em class="help-block">Please enter brand Name !</em>
			</div>
			
			</div>
			
				<div class="form-group">
			<div class="col-md-offset-4 col-md-8">
			<input type="submit" name="submit" id="submit" value="submit" class="btn btn-primary"/>
			</div>
			
			</div>
			
			
			
			
			</form>	
				
				</div>

		</div>
	
	
	</div>


</div>
</div>