function translate() {
    // Get input text
    var inputText = document.getElementById("input-text").value;

    // Make API call to translate text
    var xhr = new XMLHttpRequest();
    xhr.open("POST", "https://api.cognitive.microsofttranslator.com/translate?api-version=3.0&to=es", true);
    xhr.setRequestHeader("Content-Type", "application/json");
    xhr.setRequestHeader("Ocp-Apim-Subscription-Key", "YOUR_SUBSCRIPTION_KEY");
    xhr.onreadystatechange = function() {
        if (xhr.readyState === 4 && xhr.status === 200) {
            // Parse response and update output text
            var response = JSON.parse(xhr.responseText);
            document.getElementById("output-text").value = response[0].translations[0].text;
        }
    };
    var requestBody = [{ "Text": inputText }];
    xhr.send(JSON.stringify(requestBody));
}