package dvdBounce.state

data class DvdLogoState(
    var dimensionInSafeArea: Int,
    var bitmapDimension: Int,
    var screenDimension: Int,
    var movementSpeed: Int
)
