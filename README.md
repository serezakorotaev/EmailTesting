# EmailTesting

This project is test connecting mail with project. Project has 2 controllers.
MailController for testing to send mail.
UserController for testing to save user and giving mail with confirmation. For now this controller has not validating on existing users and not null value in field (also i can do exception handler in the future)

Body for saving user:
{
    "login" : "sergo",
    "mail" : "blablabla@bla.com",
    "phone" : 89096543322
}

This project was done in a two hours for testing the email server, so that later it could be implemented into a working project.
:)
