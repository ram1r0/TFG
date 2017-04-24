function nav(){
	 (function($){  
         
         var nav = $("#topNav");  
                   
         nav.find("li").each(function() {  
             if ($(this).find("ul").length > 0) {  
                   
                 //$("<span>").text("^").appendTo($(this).children(":first"));  
            	 
                 $(this).mouseenter(function() {  
                     $(this).find("ul").stop(true, true).slideDown();
                     $(this).css("background-color", "#EAE9E3");
                     $(this).css("color", "#182E59");
                 });  
                           
                 $(this).mouseleave(function() {  
                     $(this).find("ul").stop(true, true).slideUp();  
                     $(this).css("background-color", "");
                 });  
             }  
         });  
     })(jQuery); 
	
}

function id(e){
	return document.getElementById(e);
}