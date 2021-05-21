/**
 * 
 */

function run (){
	const pageIncludes = document.getElementById("pageIncludes");
	const language = `<%@ include file = "english.jsp" %>`
	//pageIncludes.innerHTML(`${language}`);
}
document.addEventListener("readystatechange", e => {
	if(e.target.readyState === "loading"){
		run();
	}
})