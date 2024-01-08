window.getPixels = function () {
    const canvas = engine.getRenderingCanvas();
    const pixels = engine.readPixels(0, 0, canvas.width, canvas.height);

    function getAverageColor(pixels, width, height) {

        let r = 0, g = 0, b = 0;
        const numPixels = width * height;
        const brightness = 1.75;
        for (let i = 0; i < numPixels; i++) {
            r += pixels[i * 4];
            g += pixels[i * 4 + 1];
            b += pixels[i * 4 + 2];
        }
        r = Math.min(Math.round(r / numPixels) * brightness, 255);
        g = Math.min(Math.round(g / numPixels) * brightness, 255);
        b = Math.min(Math.round(b / numPixels) * brightness, 255);

        return `rgb(${r}, ${g}, ${b})`;
    }

    pixels.then((pixels) => {
        window.icolor = getAverageColor(pixels, canvas.width, canvas.height);
    });
}
