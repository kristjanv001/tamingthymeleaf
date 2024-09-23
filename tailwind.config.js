/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ['./src/main/resources/templates/**/*.html'],
  theme: {
    extend: {
      colors: {
        'ttgreen': 'darkseagreen'
      }
    },
  },
  plugins: [require('@tailwindcss/forms')],
}