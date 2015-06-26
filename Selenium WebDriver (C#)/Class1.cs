using NUnit.Framework;
using OpenQA.Selenium;
using OpenQA.Selenium.Firefox;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HackathonTest //tu nazwa twojego projektu
{
    [TestFixture]
    public class Class1 //tu nazwa twojej klasy
    {
        [Test]
        public void HackathonTest()
        {
            IWebDriver driver = new FirefoxDriver();

            driver.Navigate().GoToUrl("http://testerzy.pl");

            driver.FindElement(By.Id("mod-search-searchword")).SendKeys("hackathon dev qa");
            driver.FindElement(By.ClassName("button")).Click();

            Assert.True(driver.FindElement(By.ClassName("result-title")).Text.Contains("Hackathon"));
            driver.Quit();
        }
    }
}
