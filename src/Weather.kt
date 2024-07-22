data class Weather (val city: String, val description: String, val temp: Int) {
    override fun toString() = "Погода (город: $city, прогноз: $description, температура: $temp)"
}