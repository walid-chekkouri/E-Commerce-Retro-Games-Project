<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<div class="container">

	

	<div class="row">
	
<c:if test="${not empty message}"> 
<div class="col-xs-12">

<div class="alert alert-success alert-dismissible">

<button type="button" class="close" data-dismiss="alert">&times;</button>
 ${message} 

</div>

</div>
</c:if>

		<div class="col-md-offset-2 col-md-8">

			<div class="panel panel-primary">

				<div class="panel-heading">

					<h4>Product Management</h4>

				</div>
				
				<div class="panel-body">
				
			<!--  FORM ELRMRNTS -->	
			<sf:form class="form-horizontal" modelAttribute="product"
			
			action="${contextRoot}/manage/products"
			method="POST" 
			enctype="multipart/form-data"
			>
			
			
			
			
			
			
			
			<div class="form-group">
			<label class="control-label col-md-4" for="name"> Enter Products Name:</label>
			<div class="col-md-8">
			<sf:input type="text" path="name" id="name" placeholder="Product Name" class="form-control"/>
				<sf:errors path="name" cssClass="help-block" element="em"/> 
			</div>
			</div>
			
			<div class="form-group">
			<label class="control-label col-md-4" for="brand"> Enter Brand Name:</label>
			<div class="col-md-8">
			<sf:input type="text" path="brand" id="brand" placeholder="Brand Name" class="form-control"/>
			<sf:errors path="brand" cssClass="help-block" element="em"/> 
			</div>
			
			</div>
			
			
			
			<div class="form-group">
			<label class="control-label col-md-4" for="description">Product Description:</label>
			<div class="col-md-8">
	<sf:textarea path="description" class="form-control"
									placeholder="Enter your description here!" /> 
									<sf:errors path="description" cssClass="help-block" element="em"/> 			
			</div>
			
			</div>
			
			<div class="form-group">
			<label class="control-label col-md-4" for="unitPrice"> Enter Unit Price:</label>
			<div class="col-md-8">
			<sf:input type="number" path="unitPrice" id="unitPrice" placeholder="Unit Price" class="form-control"/>
			<sf:errors path="unitPrice" cssClass="help-block" element="em"/> 
			</div>
			
			</div>
			<!--  File element for image upload -->
			<div class="form-group">
			<label class="control-label col-md-4" for="file"> Select an Image:</label>
			<div class="col-md-8">
			<sf:input type="file" path="file" id="file" class="form-control"/>
			<sf:errors path="file" cssClass="help-block" element="em"/> 
			
			</div>
			</div>
			
			<div class="form-group">
			<label class="control-label col-md-4" for="categoryId"> Select Category:</label>
			<div class="col-md-8">
			<sf:select class="form-control"  id="categoryId"  path="categoryId"
			items="${categories}"
			itemLabel="name"
			itemValue="id"
			
			/>
			
			</div>
			
			</div>
			
				<div class="form-group">
			<div class="col-md-offset-4 col-md-8">
			<input type="submit" name="submit" id="submit" value="submit" class="btn btn-primary"/>
			
			<sf:hidden path="id"/> 
			<sf:hidden path="code"/> 
			<sf:hidden path="supplierId"/> 
			<sf:hidden path="active"/> 
			<sf:hidden path="purchases"/> 
			<sf:hidden path="views"/> 
			</div>
			
			</div>
			
			
			 
			
			</sf:form>	
				
				</div>

		</div>
	
	
	</div>


</div>

				
	<div class='col-xs-12'>
	<h3>Available Products</h3>
	<hr/>
    </div>

<div class='col-xs-12'>
	<div style = "overflow:auto">
	
	<table id="productsTable" class="table table-condensed table-bordered">
							
				<thead>					
					<tr>					
						<th>Id</th>
						<th>&#160;</th>
						<th>Name</th>
						<th>Brand</th>
						<th>Qty. Avail</th>
						<th>Unit Price</th>
						<th>Activate</th>				
						<th>Edit</th>
					</tr>					
				</thead>
				
				<tbody>
				
				<tr>
				
				<td>4</td>
				<td>
				
				<img class="adminDataTableImg" src="${contextRoot}/resources/images/PRDMNO123PQRX.jpg"
				alt="devil may cry"/>
				</td>
				<td> devil may cry</td>
				<td>3</td>
				<td>$ 20.00</td>
				<td>
				<!-- Toggle switch -->
					<label class="switch">
					<input type="checkbox" checked="checked" value="4"/>
					<div class="slider"></div>
					</label>
				</td>
				<td>
				<a href="${contextRoot}/manage/4/product" class="btn btn-warning">
					<span class="glyphicon glyphicon-pencil"></span>
				</a>
				</td>
				
				</tr>
				
				
				<tr>
				
				<td>4</td>
				<td>
				
				<img class="adminDataTableImg" src="${contextRoot}/resources/images/PRDMNO123PQRX.jpg"
				alt="devil may cry"/>
				</td>
				<td> devil may cry</td>
				<td>3</td>
				<td>$ 20.00</td>
				<td>
				<!-- Toggle switch -->
					<label class="switch">
					<input type="checkbox" value="4"/>
					<div class="slider"></div>
					</label>
				</td>
				<td>
				<a href="${contextRoot}/manage/4/product" class="btn btn-warning">
					<span class="glyphicon glyphicon-pencil"></span>
				</a>
				</td>
				
				</tr>
				
				
				</tbody>
				
				
				<tfoot>
					<tr>					
						<th>Id</th>
						<th>&#160;</th>
						<th>Name</th>
						<th>Brand</th>
						<th>Qty. Avail</th>
						<th>Unit Price</th>
						<th>Activate</th>				
						<th>Edit</th>
					</tr>									
				</tfoot>
				
							
			</table>
	</div>
</div>

</div>
</div>