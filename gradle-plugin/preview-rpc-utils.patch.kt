
internal fun ByteArrayOutputStream.toString(charset: Charsets) = 
	this.toString(charset.name())

internal fun java.net.URLEncoder.encode(str: String, charset: Charsets) = 
	java.net.URLEncoder.encode(str, charset.name())

internal fun java.net.URLDecoder.decode(str: String, charset: Charsets) = 
        java.net.URLDecoder.decode(str, charset.name())
