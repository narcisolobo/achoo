function setLocation() {
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(setPosition, showError);
    } else {
        document.getElementById('error').innerHTML =
            'Geolocation is not supported by this browser.';
    }
}

/**
 *
 * @param {GeolocationPosition} position
 */
async function setPosition(position) {
    const latitude = position.coords.latitude;
    const longitude = position.coords.longitude;

    // Send the data to the Spring Boot server using fetch
    try {
        const response = await fetch('/set-location', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({ latitude, longitude }),
        });

    } catch (error) {
        console.error(error)
    }
}

/**
 *
 * @param {GeolocationPositionError} error
 */
function showError(error) {
    switch (error.code) {
        case error.PERMISSION_DENIED:
            document.getElementById('error').innerHTML =
                'User denied the request for Geolocation.';
            break;
        case error.POSITION_UNAVAILABLE:
            document.getElementById('error').innerHTML =
                'Location information is unavailable.';
            break;
        case error.TIMEOUT:
            document.getElementById('error').innerHTML =
                'The request to get user location timed out.';
            break;
        default:
            document.getElementById('error').innerHTML =
                'An unknown error occurred.';
            break;
    }
}
