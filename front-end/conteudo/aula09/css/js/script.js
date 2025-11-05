const btnOpen = document.querySelector("#btn-open")
const panel = document.querySelector("#panel")

btnOpen.addEventListener("click", function() {
    panel.classList.toggle("open")
})