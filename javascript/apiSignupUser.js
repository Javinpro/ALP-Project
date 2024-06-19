document.getElementById('signupForm').addEventListener('submit', async function(event) {
    event.preventDefault(); // Prevent form from submitting the default way

    const firstName = document.getElementById('inputFirstName').value;
    const lastName = document.getElementById('inputLastName').value;
    const username = document.getElementById('inputUsername').value;
    const email = document.getElementById('inputEmail').value;
    const password = document.getElementById('inputPass').value;

    const formData = {
        firstName: firstName,
        lastName: lastName,
        username: username,
        email: email,
        password: password
    };

    try {
        const response = await fetch('http://localhost:8081/api/users', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(formData)
        });

        console.log(response); // Log the response object for debugging

        if (!response.ok) {
            const errorResponse = await response.json();
            console.error('Error response from server:', errorResponse);
            throw new Error('Network response was not ok ' + response.statusText);
        }

        const result = await response.json();
        alert('Sign Up successful!');
        console.log(result);
    } catch (error) {
        console.error('There was a problem with the fetch operation:', error);
        alert('Sign Up failed! ' + error.message);
    }
});
