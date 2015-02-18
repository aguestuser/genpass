#!/bin/sh
exec scala "$0" "$@"
!#

package genpass

/**
 * Author: @aguestuser
 * Date: 2/18/15
 * License: GPLv2
 */

object Main extends App {

  val chars = Vector[Char]('0','1','2','3','4','5','6','7','8','9',
    '.','-','_','~','@','!','#','%','(',')','+','<','>','?',
    'A','B','C','D','E','F','G','H','I','J','K','L','M', 'N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
    'a','b','c','d','e','f','g','h','i','j','k','l','m', 'n','o','p','q','r','s','t','u','v','w','x','y','z')

  { 1 until 20 } map { _ => chars((Math.random * chars.size).toInt) } mkString

//  println(hexify(hash(seed)))
//  def seed : String = new Date().toString + Math.random().toString
//  def hash(s: String): Array[Byte] = java.security.MessageDigest.getInstance("SHA-256").digest(s.getBytes)
//  def hexify(bs: Array[Byte]): String = bs.map(b => (b & 0xff).toHexString).mkString
}