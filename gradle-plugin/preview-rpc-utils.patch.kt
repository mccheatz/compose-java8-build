
internal fun ByteArrayOutputStream.toString(charset: java.nio.Charset) = 
	this.toString(charset.name())

internal fun java.net.URLEncoder.encode(str: String, charset: java.nio.charset.Charset) = 
	java.net.URLEncoder.encode(str, charset.name())

internal fun java.net.URLDecoder.decode(str: String, charset: java.nio.charset.Charset) = 
        java.net.URLDecoder.decode(str, charset.name())
