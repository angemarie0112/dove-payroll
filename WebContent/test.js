function changeLanguage(){
	// get the selected language
	const selectedLanguage = $("#langSelector").val();
	
	// post the selected language to the language loader
	const url = "Language/languageLoader.jsp";
	$.post(url, {
		selectedLang: selectedLanguage
	}, function(data){
		window.location.reload();
	})
}