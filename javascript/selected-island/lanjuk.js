function submitReview() {
    var reviewText = document.getElementById('reviewInput').value;
    var reviewRating = document.getElementById('ratingInput').value;

    if (reviewText.trim() !== "") {
        var reviewTable = document.getElementById('reviewTable').getElementsByTagName('tbody')[0];
        var newRow = reviewTable.insertRow();
        var reviewCell = newRow.insertCell(0);
        var ratingCell = newRow.insertCell(1);

        ratingCell.textContent = reviewRating + "/5";
        reviewCell.textContent = reviewText;

        // Clear the input
        document.getElementById('reviewInput').value = "";
        document.getElementById('ratingInput').value = "1";
    } else {
        alert("Please write a review before submitting.");
    }
}
