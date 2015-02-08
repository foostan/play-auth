package controllers

import java.util.UUID

import play.api._
import play.api.mvc._
import util.OAuth2

object Application extends Controller {

  def authorization = util.OAuth2.authorize
}