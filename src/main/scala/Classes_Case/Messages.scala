package Classes_Case

object Messages extends App{

  def mostrarNotificacao(notificacao: Notification): String = {
    notificacao match {
      case Email(email, title, _) =>
        "Você recebeu um email de " + email + " com o título: " + title
      case SMS(number, message) =>
        "Você recebeu um SMS de" + number + "! Mensagem: " + message
      case VoiceRecording(name, link) =>
        "Você recebeu uma Mensagem de Voz de " + name + "! Clique no link para ouvir: " + link
    }
  }

  val algumSMS = SMS("12345", "Você está aí?")
  val algumaMsgVoz = VoiceRecording("Tom", "voicerecording.org/id/123")

  println(mostrarNotificacao(algumSMS))
  println(mostrarNotificacao(algumaMsgVoz))


  def mostrarNotificacaoEspecial(notificacao: Notification, emailEspecial: String, numeroEspecial: String): String = {
    notificacao match {
      case Email(email, _, _) if email == emailEspecial =>
        "Você recebeu um email de alguém especial!"
      case SMS(numero, _) if numero == numeroEspecial =>
        "Você recebeu um SMS de alguém especial!"
      case outro =>
        mostrarNotificacao(outro) // Nada especial para mostrar, então delega para nossa função original mostrarNotificacao
    }
  }


  val NumeroEspecial = "55555"
  val EmailEspecial = "jane@mail.com"
  val emailEspecial = Email("jane@mail.com", "Beber hoje a noite?", "Estou livre depois das 5!")
  val smsEspecial = SMS("55555", "Estou aqui! Onde está você?")
  println("Messagem Especial:")
  println(mostrarNotificacaoEspecial(algumSMS, EmailEspecial, NumeroEspecial))
  println(mostrarNotificacaoEspecial(algumaMsgVoz, EmailEspecial, NumeroEspecial))
  println(mostrarNotificacaoEspecial(smsEspecial, EmailEspecial, NumeroEspecial))
  println(mostrarNotificacaoEspecial(smsEspecial, EmailEspecial, NumeroEspecial))

}
