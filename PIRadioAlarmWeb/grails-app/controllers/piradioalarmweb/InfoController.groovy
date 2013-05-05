package piradioalarmweb

class InfoController {

    def index() {
		render "test"
		def exitValue = "mpc -h 10.0.1.255 play".execute().exitValue();
		render exitValue;
	}
}
