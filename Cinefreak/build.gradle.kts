// use an integer for version numbers
version = 6

cloudstream {
    authors = listOf("eclipsia")
    description ="Bangla,Hindi Movies & Series"
    /**
    * Status int as the following:
    * 0: Down
    * 1: Ok
    * 2: Slow
    * 3: Beta only
    * */
    status = 1 // will be 3 if unspecified

    tvTypes = listOf(
        "Movie",
        "TvSeries",
        "Anime"
    )
    language = "bn"
    iconUrl = "https://git.nixnet.services/eclipsia/eclipsia-cloudstream/raw/branch/main/icons/cf.png"

    isCrossPlatform = true
}
