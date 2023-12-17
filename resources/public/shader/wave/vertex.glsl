#define PI 3.14159265359

precision highp float;

// Attributes
attribute vec3 position;

// Uniforms
uniform mat4 worldViewProjection;
uniform float u_time;
uniform float u_pointsize;
uniform float u_noise_amp_1;
uniform float u_noise_freq_1;
uniform float u_spd_modifier_1;
uniform float u_noise_amp_2;
uniform float u_noise_freq_2;
uniform float u_spd_modifier_2;

// Functions (noise, random, rotate2d)
float random (in vec2 st) {
    return fract(sin(dot(st.xy,
    vec2(12.9898, 78.233)))
    * 43758.5453123);
}

// 2D Noise based on Morgan McGuire @morgan3d
// https://www.shadertoy.com/view/4dS3Wd
float noise (in vec2 st) {
    vec2 i = floor(st);
    vec2 f = fract(st);

    // Four corners in 2D of a tile
    float a = random(i);
    float b = random(i + vec2(1.0, 0.0));
    float c = random(i + vec2(0.0, 1.0));
    float d = random(i + vec2(1.0, 1.0));

    // Smooth Interpolation

    // Cubic Hermine Curve.  Same as SmoothStep()
    vec2 u = f*f*(3.0-2.0*f);
    // u = smoothstep(0.,1.,f);

    // Mix 4 coorners percentages
    return mix(a, b, u.x) +
    (c - a)* u.y * (1.0 - u.x) +
    (d - b) * u.x * u.y;
}

mat2 rotate2d(float angle){
    return mat2(cos(angle), -sin(angle),
    sin(angle), cos(angle));
}

void main() {
    vec3 pos = position;
    float wave1 = sin(pos.x * 0.2 + u_time * 1.5);
    float wave2 = sin(pos.z * 0.3 - u_time * 1.0);
    float multiWave = wave1 * wave2;

    // Combine the waves and scale the result to control the amplitude of the wave
    pos.y = multiWave * 2.0;// Scale this value to control the amplitude
    pos.y += noise(rotate2d(PI / 4.) * pos.zx * 2.0 - u_time * 0.8 * 0.6) * 0.3;

    gl_Position = worldViewProjection * vec4(pos, 1.0);
    gl_PointSize = 2.0;// Or any other size based on your preference
}
